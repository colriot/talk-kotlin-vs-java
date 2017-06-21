package optionals;

import java.util.Date;

/**
 * @author Sergey Ryabov <colriot@gmail.com>
 *         20/06/2017
 */
public class Optionals {

  static void print(JEmployee employee) {
    final StringBuilder sb = new StringBuilder();
    sb.append(employee.name);
    sb.append(" works for ");
    if (employee.company != null) {
      sb.append(employee.company.name);
    } else sb.append("food");
    sb.append(" in ");
    if (employee.company != null && employee.company.address != null) {
      sb.append(employee.company.address);
    } else sb.append("cyberspace");
    sb.append(" since ");
    if (employee.employedAt != null) {
      sb.append(employee.employedAt.toGMTString());
    } else sb.append("birth");

    System.out.println(sb.toString());
  }

  public static void main(String[] args) {
    JCompany jetbrains = new JCompany("JetBrains", "Petersburg");
    JEmployee masha = new JEmployee("Masha", jetbrains, new Date());
    JEmployee pasha = new JEmployee("Pasha", null, null);

    print(pasha);
    print(masha);
  }
}

class JEmployee {
  String name;
  JCompany company;
  Date employedAt;

  public JEmployee(String name, JCompany company, Date employedAt) {
    this.name = name;
    this.company = company;
    this.employedAt = employedAt;
  }
}

class JCompany {
  String name;
  String address;

  public JCompany(String name, String address) {
    this.name = name;
    this.address = address;
  }
}
