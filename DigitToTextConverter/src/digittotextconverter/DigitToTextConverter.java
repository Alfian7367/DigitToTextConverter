 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digittotextconverter;

public class DigitToTextConverter {

    static String[] to_19 = {
        "ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE",
        "TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN",
        "SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"
    };

    static String[] tens = {
        "TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"
    };

    static String[] denom = {
        "","THOUSAND","MILLION","BILLION","TRILLION"
    };

    /* ---------- Convert < 100 ---------- */
    private String convert_nn(int val) {
        if (val < 20) return to_19[val];
        int t = val / 10;
        int r = val % 10;
        return r == 0 ? tens[t - 2] : tens[t - 2] + "-" + to_19[r];
    }

    /* ---------- Convert < 1000 ---------- */
    private String convert_nnn(int val) {
        int h = val / 100;
        int r = val % 100;
        String word = "";

        if (h > 0) {
            word = to_19[h] + " HUNDRED";
            if (r > 0) word += " ";
        }
        if (r > 0) {
            word += convert_nn(r);
        }
        return word;
    }

    /* ---------- Build Linked List ---------- */
    private Node buildList(int num) {
        Node head = null;
        int index = 0;

        while (num > 0) {
            int chunk = num % 1000;
            Node newNode = new Node(chunk, index);
            newNode.next = head;   // insert at front
            head = newNode;

            num /= 1000;
            index++;
        }
        return head;
    }

    /* ---------- Convert Using Linked List ---------- */
    public String english_number(int num) {
        if (num == 0) return "ZERO";

        Node head = buildList(num);
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            if (current.value != 0) {
                result.append(convert_nnn(current.value));
                if (!denom[current.index].isEmpty()) {
                    result.append(" ").append(denom[current.index]);
                }
                result.append(", ");
            }
            current = current.next;
        }

        // remove last comma and space
        return result.substring(0, result.length() - 2);
    }
}
