package code._4_student_effort.Challange5;

public class DescBubbleSort extends TemplateMethodBubbleSort{
    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i1 >= i2)
            return true;
        else
            return false;
    }
}
