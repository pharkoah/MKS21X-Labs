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
      System.out.println("ERROR! INDEX IS INVALID! MAKE IT VALID!");
      return null;
    }
    String res = data[index];
    return res;
  }

  public String set(int index, String element) {
    if ( (index < 0 ) || (index >= size) ) {
      System.out.println("ERROR! INDEX IS INVALID! MAKE IT VALID!");
      return null;
    }
    String res = data[index];
    data[index] = element;
    return res;
  }
}
