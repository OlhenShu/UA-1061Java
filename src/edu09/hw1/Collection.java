package edu09.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collection {
    private int count;
    private int max;
    private int min;

    private List<Integer> collection;

    public Collection(int count, int max, int min) {
        this.count = count;
        this.max = max;
        this.min = min;
        this.collection = this.generateCollection();
    }

    private List<Integer> generateCollection() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < this.count; i++) {
            list.add(random.nextInt(this.max - this.min) + this.min);
        }

        return list;
    }

    public List<Integer> getCollection() {
        return this.collection;
    }

    public Integer getMaxValueIndex() {
        Integer index = null;
        Integer max = null;
        for (int i = 0; i < this.count; i++) {
            if (index == null || max < this.collection.get(i)) {
                index = i;
                max = this.collection.get(i);
            }
        }
        return index;
    }

    public Integer getMinValueIndex() {
        Integer index = null;
        Integer min = null;
        for (int i = 0; i < this.count; i++) {
            if (index == null || min > this.collection.get(i)) {
                index = i;
                min = this.collection.get(i);
            }
        }
        return index;
    }

    public void swapElementsByIndex(int first, int second) {
        Integer temp = this.collection.get(first);
        this.collection.set(first, this.collection.get(second));
        this.collection.set(second, temp);
    }

    public void insertNumberBeforeNegative() {
        Random random = new Random();
        Integer randomThreeDigit = random.nextInt(1000 - 100) + 100;
        for (int i = 0; i < this.count; i++) {
            if (this.collection.get(i) < 0) {
                this.collection.add(i, randomThreeDigit);
                break;
            }
        }
    }

    public void insertZeroBetweenElements() {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i < this.count; i++) {
            if ((this.collection.get(i - 1) < 0 && this.collection.get(i) > 0)
                    || (this.collection.get(i - 1) > 0 && this.collection.get(i) < 0)
            ) {
                indexes.add(i);
            }
        }
        int inc = 0;
        for (int index : indexes) {
            this.collection.add(index + inc, 0);
            inc++;
        }
    }

    public List<Integer> getFirstElements(int countTo) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < countTo; i++) {
            list.add(this.collection.get(i));
        }

        return list;
    }

    public List<Integer> getLastElements(int countFrom) {
        List<Integer> list = new ArrayList<>();
        for (int i = this.collection.size() - 1; i >= countFrom; i--) {
            list.add(this.collection.get(i));
        }

        return list;
    }

    public void removeLastEven() {
        boolean isRemove = false;
        for (int i = this.collection.size() - 1; i >= 0; i--) {
            if (this.collection.get(i) % 2 == 0) {
                this.collection.remove(i);
                isRemove = true;
                break;
            }
        }

        if (!isRemove) {
            System.out.println("No even numbers found.");
        }
    }

    public void removeElementAfterMin() {
        int minIndex = this.getMinValueIndex();

        if (minIndex < this.collection.size() - 1) {
            this.collection.remove(minIndex + 1);
        }
    }
}
