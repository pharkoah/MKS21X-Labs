public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private T value;
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  @Override

  public boolean add (T e) {
    int correct = whereToPlace(e);
    super.add(correct, e);
    return true;
  }


  public void add(int index, T element) {
    index = whereToPlace(element);
    super.add(index, element);
  }

  private int whereToPlace(T value){
    /*return the index that the value should be placed
    when inserting into the OrderedArrayList .*/
    for (int i = 0; i < size(); i++) {
      if (value.compareTo(get(i)) <= 0) {
        return i;
      }
    }
    return -1;
  }
}
