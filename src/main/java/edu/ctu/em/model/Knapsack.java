/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ctu.em.model;

/**
 *
 * @author quykhang
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knapsack {

    private List<SuggestedServer> items;
    private float capacity;

    public Knapsack(List<SuggestedServer> items, float capacity) {
        this.items = items;
        this.capacity = capacity;
    }

    private class Node implements Comparable<Node> {

        public double bound;
        public double tempMax;
        public double value;
        public double weight;
        
        public Node() {
            this.bound = 0.0;
            this.tempMax = 0.0;
            this.value = 0.0;
            this.weight = 0.0;
        }

        public Node(double bound, double tempMax, double value, double weight) {
            this.bound = bound;
            this.tempMax = tempMax;
            this.value = value;
            this.weight = weight;
        }
        
        @Override
        public int compareTo(Node other) {
            return (int) (other.bound - bound);
        }
    }
    
    Node initiateRoot(double maxRatio) {
            Node rn = new Node();
            rn.value = 0.0;
            rn.weight = capacity;
            rn.bound = capacity * maxRatio;
            rn.tempMax = 0.0;
            return rn;
        }

    void updateTempMax(Node node, int x[], int n) {
        if (node.tempMax < node.value) {
            node.tempMax = node.value;
            for (int i = 0; i < n; i++) {
                items.get(i).rentalTime = x[i];
            }
        }
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    void branchAndBound(int i, Node node, int x[], int n) {
        System.out.println("Dang xet: " + items.get(i).server.getNameServer());
        
        int yk = min(items.get(i).server.getTimeRemaining(), (int) (node.weight / items.get(i).server.getPrice()));
        for (int j = yk; j >= 0; j--) {
            node.value += j * items.get(i).server.getBenchMark();
            node.weight -= j * items.get(i).server.getPrice();
            if(i+1 < items.size()){
                node.bound = node.value + node.weight * items.get(i + 1).server.getRatio();
                System.out.println(j + " " + node.value + " " + 
                        node.bound + " " + items.get(i).server.getNameServer() + 
                        " " + items.get(i + 1).server.getRatio());
            }
                

            if (node.bound > node.tempMax) {
                x[i] = j;
                if ((i == n - 1) || (node.weight == 0)) {
                    updateTempMax(node, x, n);
                } else {
                    branchAndBound(i + 1, node, x, n);
                }
            }
            x[i] = 0;
            node.value -= j * items.get(i).server.getBenchMark();
            node.weight += j * items.get(i).server.getPrice();
        }
        System.out.println("Xet xong: " + items.get(i).server.getNameServer());
    }

    public void solve() {
        int[] n = new int[items.size()];
        Collections.sort(items, SuggestedServer.byRatio());

        Node root = initiateRoot(items.get(0).server.getRatio());
        branchAndBound(0, root, n, items.size());
    }
    
    public double getWeight() {
        double totalWeight = 0;
        for (SuggestedServer item : items) {
            totalWeight += item.server.getPrice()*item.getRentalTime();
        }
        return totalWeight;
    }

    public double getValue() {
        double totalValue = 0;
        for (SuggestedServer item : items) {
            totalValue += item.server.getBenchMark()*item.getRentalTime();
        }
        return totalValue;
    }
    
    public double getTime() {
        double totalTime = 0;
        for (SuggestedServer item : items) {
            totalTime += item.rentalTime;
        }
        return totalTime;
    }

    public List<SuggestedServer> getItems() {
        return items;
    }

    public void setItems(List<SuggestedServer> items) {
        this.items = items;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Knapsack problem using Branch and Bound");
        builder.append(": ");
        builder.append(getValue());
        builder.append(" ");
        builder.append(getWeight());
        builder.append("\n");

        Collections.sort(items, SuggestedServer.byLabel());

        for (SuggestedServer item : items) {
            builder.append(item.server.getIdServer());
            builder.append(" ");
        }

        return builder.toString();
    }
}
