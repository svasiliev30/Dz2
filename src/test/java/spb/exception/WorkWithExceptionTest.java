package spb.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sbp.exceptions.CustomException;
import sbp.exceptions.WorkWithExceptions;

public class WorkWithExceptionTest {

    /**
     * Идет проверка на то,подбрасывается ли даные из класса WorkWithExceptions в класс
     * CustomException
     */
    @Test
    public  void exceptionProcessing_throwUncheckedException_Test(){
        WorkWithExceptions workWithExceptions = new WorkWithExceptions();
        Assertions.assertThrows(CustomException.class, () -> workWithExceptions.exceptionProcessing());
    }
}
