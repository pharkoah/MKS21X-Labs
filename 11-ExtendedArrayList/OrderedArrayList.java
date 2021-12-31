public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private T value;
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
}
