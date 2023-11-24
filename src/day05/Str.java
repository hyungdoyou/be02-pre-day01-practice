package day05;

public class Str {
    public static void main(String[] args) {
        String str1 = "안녕";
        String str2 = "하세요";

        String str3 = "abc-def.ghi-dfa#3312s";
        str3 = str3.replace("-", "");  // "" 안띄어쓰면 해당 글자를 지워버리는 기능이 되버림
        str3 = str3.replace(".", "");
        str3 = str3.replace("#", "");

        System.out.println(str1 + str2);
        System.out.println(str3);

        String str4 = "abc:def:ghi";
        String[] strArr = str4.split(":");  // : 를 기준으로 쪼개서 배열 형태로 반환 해줌


        int empNo = 10000;
        int salaryAvg = 90000;

        String sql = "SELECT emp_no, AVG(salary) " +
                "FROM salaries " +
                "WHERE emp_no >= " + empNo + " " +
                "GROUP BY emp_no " +
                "HAVING AVG(salary) > " + salaryAvg + ";";
        System.out.println(sql);

        // 빈칸을 표현식으로 변경
        // %d : 숫자, %s : 글자
        String str5 = "SELECT emp_no, AVG(salary) " +
                "FROM salaries " +
                "WHERE emp_no >= %d " +
                "GROUP BY emp_no " +
                "HAVING AVG(salary) > %d;";
        // String.format(빈칸 뚫어둔 글자, 빈칸에 들어갈 변수)
        System.out.println(
                String.format(str5, empNo, salaryAvg))
        ;
    }
}
