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

  public int length() {   //added it in for tests in phase 4
    return data.length;
  }

  public boolean add(String s) {
    if (size >= data.length) {
      resize();
    }
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

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
  }

  private void resize() {
    String[] reArr = new String[2 * data.length + 1];
    for (int i = 0; i < size; i++) {
      reArr[i] = data[i];
    }
    data = reArr;
  }

  public String remove(int index) {
    String res = data[index];
    if ( (index < 0 ) || (index >= size) ) {
      System.out.println("ERROR! INDEX IS INVALID! MAKE IT VALID!");
      return null;
    }
    for (int i = index; i < size; i++) {
      data[i] = data[i+1];
    }
    data[size-1] = null;
    return res;
  }

  public int indexOf(String target) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = size-1; i > 0; i--) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String value) {
    if ( (index < 0 ) || (size > data.length) || (index > size) ) {
      System.out.println("ERROR! cringe INDEX IS INVALID! MAKE IT VALID!");
    }else {
      for (int i = data.length; i > index; i--) {
        data[i] = data[i-1];
      }
    }
    data[index] = value;
    size++;
  }

  public boolean remove(String target) {
    if (indexOf(target) != -1) {
      remove(indexOf(target));
      return true;
    } else {
      return false;
    }
  }
}
