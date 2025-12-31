/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digittotextconverter;

class Node {
    int value;     // e.g. 345
    int index;     // thousand index to divide in nnn,nnn,nnn,...as one node
    Node next;

    Node(int value, int index) {
        this.value = value;
        this.index = index;
        this.next = null;
    }
}
