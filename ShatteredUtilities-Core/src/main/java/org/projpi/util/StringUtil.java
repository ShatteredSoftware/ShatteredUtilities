package org.projpi.util;

public class StringUtil {
  private StringUtil() {}

  public static boolean isEmptyOrNull(String string) {
    return string == null || string.isEmpty();
  }
}
