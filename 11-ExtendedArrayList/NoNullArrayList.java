import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;


  /*public boolean add (T e) {
    try {
      super.add(e);
    } catch(IllegalStateException) {

    }
  }*/

  @Override
  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Null can not be added");
    } else {
      super.add(index, element);
    }
  }

  /* @Override
  public T set(int index, T element) {

  }*/

}
