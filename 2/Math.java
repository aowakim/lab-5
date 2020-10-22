import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TaskTest {
    //поставщик данных для тестового метода нахождения модуля
    @DataProvider
    public Object[][] modul() {
        return new Object[][]{
                {5, 5},
                {3, -3},
                {7, 7},
                {1, -1}
        };
    }
    //поставщик данных для тестового метода нахождения суммы
    @DataProvider
    public Object[][] Exact() {
        return new Object[][]{
                {10, 4, 6},
                {-14, -11, -3},
                {21, 6, 15},
                {30, 32, -2}
        };
    }
    //поставщик данных для тестового метода нахождения частного
    @DataProvider
    public Object[][] FloorDi() {
        return new Object[][]{
                {2, 7, 3},
                {-5, -25, 5},
                {0, 1, 100},
                {4, 100, 24}
        };
    }
    @Test(dataProvider = "modul") //тестовый метод
    public void TestAbs(int result, int Abs) throws Exception {
        //выполнение проверки в тесте
        Assert.assertEquals(result, Math.abs(Abs),"ошибка модуля");
    }
    @Test (dataProvider = "Exact") //тестовый метод
    public void TestAddExact(int result, int a, int b) throws Exception {
        //выполнение проверки в тесте
        Assert.assertEquals(result, Math.addExact(a, b),"ошибка функции addExact");
    }
    @Test (dataProvider = "FloorDi") //тестовый метод
    public void TestFloorDiv(int result, int a, int b) throws Exception{
        //выполнение проверки в тесте
        Assert.assertEquals(result, Math.floorDiv(a, b),"ошибка функции floorDiv");
    }
}
