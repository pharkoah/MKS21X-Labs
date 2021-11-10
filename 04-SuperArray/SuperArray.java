public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String s) {
    data[size] = s;
    size++;
    return true;
  }

  public String toString() {
    String res = "";
    res += "[";
    for (int i = 0; i < size; i++) {
      if (i == size-1) {
        res += data[i];
      }else {
        res += data[i] + ", ";
      }
    }res += "]";
    return res;
  }

  public String toStringDebug() {
    String res = "";
    res += "[";
    for (int i = 0; i < data.length; i++) {
        if (i == data.length-1) {
          res += data[i];
        }else {
          res += data[i] + ", ";
        }
    }res += "]";
    return res;
  }

  public String get(int index) {
    if ( (index < 0 ) || (index >= size) ) {
      return null;
    }
    String res = data[index].toString();
    return res;
  }
}
