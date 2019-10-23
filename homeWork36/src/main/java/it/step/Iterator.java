package it.step;

// Зачем нужен кастомный интерйест, если  есть стандартный java.util.Iterator
public interface Iterator {
    boolean hasNext();

    Object next();
}
