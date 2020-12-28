/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

public class LinkedListtoInteger {

    public void LinkedListtoInteger() {
        int iBinaryToDecimal = 0;
        int iCounterPotencia = 0;
        StringBuffer sBinaryNumber = new StringBuffer();
        while (node != null) {
            sBinaryNumber.append(Integer.toString(node.val));
            node = node.next;
        }
        for (int i = sBinaryNumber.length() - 1; i >= 0; i--) {
            if (sBinaryNumber.charAt(i) == '1') {
                iBinaryToDecimal += (Math.pow(2, iCounterPotencia));
            }
            iCounterPotencia++;
        }
        System.out.println(iBinaryToDecimal);
    }
}
