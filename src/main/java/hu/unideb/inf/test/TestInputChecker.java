package hu.unideb.inf.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import hu.unideb.inf.NewIncidentDialogController;
import javafx.scene.control.TextField;
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

public class TestInputChecker {
    @BeforeEach
    public static void setUp() {
        TextField testTf1 = new TextField("");
        TextField testTf2 = new TextField("Proba");
    }
    @Test
    public static void testEmptyTextField(TextField tf){


    }
}
