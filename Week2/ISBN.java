/*
@author Vedh
*/
class ISBN{
    String normalizeCode(String raw) {
        raw = raw.trim();
        String first3 = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);
        return first3 + remaining;
    }
    String validateAndFormat(String code) {
        if (code.length() != 13)
            return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i)))
                return "Invalid: publisher code must be 3 letters";
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i)))
                return "Invalid: body must contain only digits";
        }
        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);
        StringBuilder sb = new StringBuilder();
        sb.append("[")
          .append(publisher)
          .append("] YEAR: ")
          .append(year)
          .append(" | CATALOG: ")
          .append(catalog);
        return sb.toString();
    }
    public static void main(String[] args) {
        ISBN obj = new ISBN();
        String code = obj.normalizeCode(" pen2026004251 ");
        System.out.println(obj.validateAndFormat(code));
        code = obj.normalizeCode("12N2026004251");
        System.out.println(obj.validateAndFormat(code));
    }
}