# Свертывание и развертывание

О принципах работы шагов, которые возвращают результат, можно
прочитать [здесь](./../../../core.api/doc/rus/IDEA.MD#Шаги,-которые-возвращают-результат).

О принципах работы шагов, которые выполняют действие, можно
прочитать [здесь](./../../../core.api/doc/rus/IDEA.MD#Шаги,-которые-выполняют-действие).

Полезные страницы:

- [Поиск элементов](ELEMENTS_SEARCHING.MD)
- [Виджеты](./WIDGET.MD)

```java
import ru.tinkoff.qa.neptune.selenium.api.widget.Expandable;
import ru.tinkoff.qa.neptune.selenium.api.widget.Widget;

public class ExpandableWidget extends Widget implements Expandable {
    //Реализация логики
}
```

```java
import static org.openqa.selenium.By.*;
import static ru.tinkoff.qa.neptune.selenium.SeleniumStepContext.inBrowser;
import static ru.tinkoff.qa.neptune.selenium.functions.searching.SearchSupplier.*;

public class Tezzt {

    @Test
    public void tezzt() {
        //Развертывание элемента, 
        //который описан классом, наследующим ru.tinkoff.qa.neptune.selenium.api.widget.Widget и 
        //реализующим интерфейс ru.tinkoff.qa.neptune.selenium.api.widget.Expandable,
        inBrowser().expand(widget(ExpandableWidget.class));
        //который будет найден во время выполнения действия

        //Свертывание элемента, 
        //который описан классом, наследующим ru.tinkoff.qa.neptune.selenium.api.widget.Widget и 
        //реализующим интерфейс ru.tinkoff.qa.neptune.selenium.api.widget.Expandable,
        inBrowser().collapse(widget(ExpandableWidget.class));
        //который будет найден во время выполнения действия

        //Либо элемент, 
        //который описан классом, наследующим ru.tinkoff.qa.neptune.selenium.api.widget.Widget и 
        //реализующим интерфейс ru.tinkoff.qa.neptune.selenium.api.widget.Expandable,
        //можно найти заранее
        var element = inBrowser().find(widget(ExpandableWidget.class));
        inBrowser().expand(element); //и выполнить развертывание в нужный момент
        inBrowser().collapse(element); //или свёртывание
    }
}
```