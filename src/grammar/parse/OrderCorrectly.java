package grammar.parse;

import java.util.Comparator;

final class OrderCorrectly implements Comparator<Object> {
  public int compare(Object o1, Object o2) {
    String str1 = (String)o1;
    String str2 = (String)o2;
    int index1 = str1.indexOf("/");
    String loc1 = str1.substring(index1 + 1);
    int index1_1 = loc1.indexOf(",");
    int lc1_1 = Integer.parseInt(loc1.substring(0, index1_1));
    int lc1_2 = Integer.parseInt(loc1.substring(index1_1 + 1));
    int index2 = str2.indexOf("/");
    String loc2 = str2.substring(index2 + 1);
    int index2_1 = loc2.indexOf(",");
    int lc2_1 = Integer.parseInt(loc2.substring(0, index2_1));
    int lc2_2 = Integer.parseInt(loc2.substring(index2_1 + 1));
    if (lc1_1 == lc2_1)
      return lc1_2 - lc2_2; 
    return lc1_1 - lc2_1;
  }
}


/* Location:              /home/yujin/Downloads/JFLAP7.1.jar!/grammar/parse/OrderCorrectly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */