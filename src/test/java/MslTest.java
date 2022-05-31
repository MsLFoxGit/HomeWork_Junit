import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
public class MslTest {
    @Test
    @DisplayName("mslTset: invalid fileName ")
    public void writeStringTest(){
        String[] notValidFileName = {
                "data.jsom",
                "data.jsonA",
                "d ata.json",
                ".json"
        };
        String json = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"firstName\": \"John\",\n" +
                "    \"lastName\": \"Smith\",\n" +
                "    \"country\": \"USA\",\n" +
                "    \"age\": 25\n" +
                "  },\n" +
                "]";
        for (String itemNotValidFileName: notValidFileName)
              {
                  Assertions.assertThrows(IllegalStateException.class,
                          () -> Task1.writeString( json, itemNotValidFileName));
        }
    }
    @Test
    @DisplayName("HamcrestTest methods for Task1.listToJson()")
    public void listToJsonTest(){
        List<Employee> testList = new ArrayList<>();
        String actualJsonString = Task1.listToJson(testList);
        assertThat(actualJsonString, equalTo("[]"));
        assertThat(actualJsonString, notNullValue());
        String a = "";
        assertSame(a.getClass(), actualJsonString.getClass());
    }
}
