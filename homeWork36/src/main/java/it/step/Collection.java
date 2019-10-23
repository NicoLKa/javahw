package it.step;

// Зачем нужен еше один интерфейс, если уже есть Iterable?
public interface Collection  {
    Iterator getIterator();
}
