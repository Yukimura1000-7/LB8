public class Main {
    public static void main(String[] args) {

        String originalString = " Если они не поймут, что мы несем им математически безошибочное счастье, наш долг заставить их быть счастливыми.  ";

        StringOperation toUpperCase = str -> str.toUpperCase();
        
        StringOperation toLowerCase = str -> str.toLowerCase();
        
        StringOperation trimSpaces = str -> str.trim();
        
        StringOperation reverseString = str -> new StringBuilder(str).reverse().toString();

        System.out.println("Оригинальная строка: [" + originalString + "]");
        System.out.println("----------------------------------------");
        
        System.out.println("Верхний регистр: [" + StringProcessor.processString(originalString, toUpperCase) + "]");
        System.out.println("Нижний регистр:  [" + StringProcessor.processString(originalString, toLowerCase) + "]");
        System.out.println("Удаление пробелов: [" + StringProcessor.processString(originalString, trimSpaces) + "]");
        System.out.println("Реверс строки:   [" + StringProcessor.processString(originalString, reverseString) + "]");
    }
}