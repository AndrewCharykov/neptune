package ru.tinkoff.qa.neptune.core.api.properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.tinkoff.qa.neptune.core.api.properties.object.suppliers.ObjectSupplier1;
import ru.tinkoff.qa.neptune.core.api.properties.object.suppliers.ObjectSupplier2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import static java.time.Duration.ofHours;
import static java.time.Duration.ofSeconds;
import static java.util.Map.entry;
import static org.apache.commons.io.FileUtils.forceDelete;
import static org.apache.commons.io.FileUtils.getFile;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static ru.tinkoff.qa.neptune.core.api.properties.GeneralPropertyInitializer.PROPERTIES;
import static ru.tinkoff.qa.neptune.core.api.properties.GeneralPropertyInitializer.refreshProperties;
import static ru.tinkoff.qa.neptune.core.api.properties.TestBooleanPropertySupplier.TEST_BOOLEAN_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestBytePropertySupplier.TEST_BYTE_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestDoublePropertySupplier.TEST_DOUBLE_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestDurationSupplier.TestChronoUnitSupplier.TEST_CHRONO_UNIT_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestDurationSupplier.TestTimeValueSupplier.TEST_TIME_VALUE_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestEnum.*;
import static ru.tinkoff.qa.neptune.core.api.properties.TestEnumItemPropertySuppler.TEST_ENUM_ITEM_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestEnumItemsPropertySuppler.TEST_ENUM_ITEMS_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestFloatPropertySupplier.TEST_FLOAT_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestIntegerPropertySupplier.TEST_INTEGER_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestLongPropertySupplier.TEST_LONG_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestObjectSupplier.TEST_OBJECT_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestObjectsSupplier.TEST_OBJECTS_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestSrortPropertySupplier.TEST_SHORT_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.TestURLValuePropertySupplier.TEST_URL_PROPERTY;
import static ru.tinkoff.qa.neptune.core.api.properties.object.suppliers.ObjectSupplier1.O1;
import static ru.tinkoff.qa.neptune.core.api.properties.object.suppliers.ObjectSupplier2.O2;

public class FilePropertyReadingTest extends BasePropertyReadingTest {

    private static final Map<String, String> PROPERTY_SET = Map
            .ofEntries(entry(TEST_BOOLEAN_PROPERTY, "true"),
                    entry(TEST_BYTE_PROPERTY, "2"),
                    entry(TEST_DOUBLE_PROPERTY, "3"),
                    entry(TEST_CHRONO_UNIT_PROPERTY,  "HOURS"),
                    entry(TEST_TIME_VALUE_PROPERTY, "4"),
                    entry(TEST_ENUM_ITEM_PROPERTY, "ITEM4"),
                    entry(TEST_ENUM_ITEMS_PROPERTY, "ITEM1,ITEM2,ITEM3"),
                    entry(TEST_FLOAT_PROPERTY, "5"),
                    entry(TEST_INTEGER_PROPERTY, "6"),
                    entry(TEST_LONG_PROPERTY, "7"),
                    entry(TEST_OBJECTS_PROPERTY, ObjectSupplier1.class.getName() + "," + ObjectSupplier1.class.getName()),
                    entry(TEST_OBJECT_PROPERTY, ObjectSupplier2.class.getName()),
                    entry(TEST_SHORT_PROPERTY, "8"),
                    entry(TEST_URL_PROPERTY, "https://www.programcreek.com"));

    public FilePropertyReadingTest() throws Exception {
        super(is(true),
                is(Byte.valueOf("2")),
                is(3D),
                is(ofHours(4)),
                contains(ITEM1,ITEM2,ITEM3),
                is(ITEM4),
                is(5F),
                is(6),
                is(7L),
                contains(O1, O1),
                is(O2),
                is(Short.valueOf("8")),
                is(new URL("https://www.programcreek.com")));
    }

    @BeforeClass
    public static void setUp() throws Exception {
        Properties prop = new Properties();
        try (OutputStream output = new FileOutputStream(PROPERTIES)) {
            // set the properties value
            PROPERTY_SET.forEach(prop::setProperty);
            // save properties to project root folder
            prop.store(output, null);
        }
        refreshProperties();
    }

    @AfterClass
    public void tearDown() throws Throwable {
        PROPERTY_SET.keySet().forEach(s -> System.getProperties().remove(s));
        GeneralPropertyInitializer.arePropertiesRead = false;
        File toDelete = getFile(PROPERTIES);
        if (toDelete.exists()) {
            forceDelete(toDelete);
        }
    }
}
