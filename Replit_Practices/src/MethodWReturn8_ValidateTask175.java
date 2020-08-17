public class MethodWReturn8_ValidateTask175 {
    public static void main(String[] args) {

    }

    public boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {

        if(taskId - currentId == 1 && notEmpty ){
            return true;
        }else{
            return false;
        }

    }


}
