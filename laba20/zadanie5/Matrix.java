package ru.agcon.new_labs.laba20.zadanie5;

import java.util.ArrayList;
import java.util.Comparator;

public class Matrix<E> {
    ArrayList<ArrayList<E>> matrix = new ArrayList();
    int sizeX = 0;
    int sizeY = 0;

    public Matrix() {
    }

    public void setMatrix(E[][] matrix) {
        Object[][] var2 = matrix;
        int var3 = matrix.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            E[] e = (E[]) var2[var4];
            ++this.sizeY;
            int sizeXTmp = 0;
            ArrayList<E> tmp = new ArrayList();
            Object[] var8 = e;
            int var9 = e.length;

            for(int var10 = 0; var10 < var9; ++var10) {
                E element = (E) var8[var10];
                ++sizeXTmp;
                tmp.add(element);
            }

            if (sizeXTmp != this.sizeX) {
                this.sizeX = sizeXTmp;
            }

            this.matrix.add(tmp);
        }

    }

    public void addColumn(E[] column) {
        ++this.sizeX;

        for(int i = 0; i < column.length; ++i) {
            if (this.matrix.size() >= i) {
                ((ArrayList)this.matrix.get(i)).add(column[i]);
            }
        }

    }

    public void addRow(E[] row) {
        ++this.sizeY;
        ArrayList<E> tmp = new ArrayList();

        for(int i = 0; i < row.length; ++i) {
            tmp.add(row[i]);
        }

        this.matrix.add(tmp);
    }

    public boolean transparentMatrix() {
        if (this.sizeX != this.sizeY) {
            return false;
        } else {
            for(int i = 0; i < this.sizeY; ++i) {
                for(int j = i; j < this.sizeX; ++j) {
                    E tmp = (E) ((ArrayList)this.matrix.get(j)).get(i);
                    ((ArrayList)this.matrix.get(j)).set(i, ((ArrayList)this.matrix.get(i)).get(j));
                    ((ArrayList)this.matrix.get(i)).set(j, tmp);
                }
            }

            return true;
        }
    }

    public E findMax(Comparator comparator) {
        if (this.sizeY == 0 && this.sizeX == 0) {
            return null;
        } else {
            E max = (E) ((ArrayList)this.matrix.get(0)).get(0);

            for(int i = 0; i < this.sizeY; ++i) {
                for(int j = 0; j < this.sizeX; ++j) {
                    if (comparator.compare(max, ((ArrayList)this.matrix.get(i)).get(i)) < 0) {
                        max = (E) ((ArrayList)this.matrix.get(i)).get(j);
                    }
                }
            }

            return max;
        }
    }

    public E findMin(Comparator comparator) {
        if (this.sizeY == 0 && this.sizeX == 0) {
            return null;
        } else {
            E min = (E) ((ArrayList)this.matrix.get(0)).get(0);

            for(int i = 0; i < this.sizeY; ++i) {
                for(int j = 0; j < this.sizeX; ++j) {
                    if (comparator.compare(min, ((ArrayList)this.matrix.get(i)).get(i)) > 0) {
                        min = (E) ((ArrayList)this.matrix.get(i)).get(j);
                    }
                }
            }

            return min;
        }
    }

    public void deleteColumn(int index) {
        if (index <= this.sizeX) {
            --this.sizeX;

            for(int i = 0; i < this.sizeY; ++i) {
                ((ArrayList)this.matrix.get(i)).remove(index);
            }

        }
    }

    public void deleteRow(int index) {
        if (index <= this.sizeY) {
            --this.sizeY;
            this.matrix.remove(index);
        }
    }

    public String toString() {
        String result = "";

        for(int i = 0; i < this.sizeY; ++i) {
            for(int j = 0; j < this.sizeX; ++j) {
                result = result + String.valueOf(((ArrayList)this.matrix.get(i)).get(j)) + " ";
            }

            result = result + "\n";
        }

        return result;
    }
}
