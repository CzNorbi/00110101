package hu.unideb.inf.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import hu.unideb.inf.NewIncidentDialogController;
import hu.unideb.inf.model.Car;
import hu.unideb.inf.model.CarParts;
import javafx.scene.control.TextField;
import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.BDDMockito.given;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import javafx.scene.control.TextField;

public class TestInputChecker
{
    public static void main(String[] args) {
        testCar();
    }

    @Test
    public static void testCar() {
        String testBrand = "Peugeot";
        String testType = "307";
        String testLP = "ABC-007";
        String testInsurer = "nn";
        CarParts testPart = new CarParts();

        Car testCar = new Car(testBrand, testType, testLP, testInsurer, testPart);

        assertEquals(testCar.getBrand(), testBrand);
        assertEquals(testCar.getType(), testType);
        assertEquals(testCar.getLicensePlate(), testLP);
        assertEquals(testCar.getNameOfInsurer(), testInsurer);

        System.out.println("OK");
    }
}
