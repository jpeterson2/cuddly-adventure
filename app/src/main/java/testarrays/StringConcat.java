package testarrays;

import org.checkerframework.checker.signedness.qual.Unsigned;
import org.checkerframework.checker.signedness.qual.Signed;

public class StringConcat {
  public String doConcat(@Unsigned int i, String s) {
    return s + i;
  }
}
