import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;

  @Override
  public boolean add (T e) {
    if (e == null) {
      throw new IllegalArgumentException ("Null can not be added");
    } else {
      super.add(e);
      return true;
    }
  }


  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Null can not be added");
    } else {
      super.add(index, element);
    }
  }


  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Null can not be added");
    } else {
      T oldEl = super.get(index);
      super.set(index, element);
      return oldEl;
    }
  }

}
