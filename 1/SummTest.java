import org.testng.Assert;
import org.testng.annotations.Test;

public class SummTest {
    private Summ object_sum = new Summ();

    @Test //тестовый метод
    public void TestSum() throws Exception {
        Assert.assertEquals(5, object_sum.sum(2, 3));
    }
}

Файл TestNG.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Default Suite">//название теста
<!-- Default Suite -->
<test name="untitled5_1"> <classes><class name="SummTest"><methods><include name="TestSum"/>//тестовый метод </methods></class>
<!-- SummTest -->
</classes></test>
<!-- untitled5_1 -->
</suite>
