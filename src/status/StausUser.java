/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author srinivsi
 */
public class StausUser 
{

    void statusDetail(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public enum Code{ZERO,ONE,TWO,THREE};
   public void statusDetail(Code code)
{
switch(code)
        {
        case ZERO: System.out.println("REJECTED");
        break;
        case ONE: System.out.println("PENDING");
        break;
        case TWO:
        System.out.println("PROCESSING");
        break;
        case THREE: 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
