import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private WebElement tableElement;
    private WebDriver driver;

    public Table(WebElement tableElement, WebDriver driver){
        this.tableElement = tableElement;
        this.driver = driver;
    }

    public List<WebElement> getRows(){
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        rows.remove(0);    //   удаление заголовка

        return rows;
    }



    public List<WebElement> getHeadings(){
        WebElement headingRow = tableElement.findElement(By.xpath(".//tr[1]"));

        List<WebElement> headingColums = headingRow.findElements(By.xpath(".//th"));

        return headingColums;
    }



    public List<List<WebElement>> getRowsWithColums(){
        List<WebElement> rows = getRows();

        List<List<WebElement>> rowsWithColums = new ArrayList<List<WebElement>>();

        for (WebElement row : rows){
            List<WebElement> rowWithColums = row.findElements(By.xpath(".//td"));
            rowsWithColums.add(rowWithColums);
        }

        return rowsWithColums;
    }



    public String getValueFromCell(int rowNumber, int columNumber){

        List<List<WebElement>> rowsWithColums = getRowsWithColums();
        WebElement cell = rowsWithColums.get(rowNumber - 1).get(columNumber - 1);

        return cell.getText();
    }



    public List<Map<String, WebElement>> getRowsWithColumsByHeadings(){
        List<List<WebElement>> rowsWithColums = getRowsWithColums();
        List<WebElement> headingRow = getHeadings();
        List<Map<String, WebElement>> rowsWithColumsByHeadings = new ArrayList<Map<String, WebElement>>();
        Map<String, WebElement> rowByHeadings;

        for(List<WebElement> row : rowsWithColums) {
            rowByHeadings = new HashMap<String, WebElement>();

            for (int i = 0; i < headingRow.size(); i++) {
                rowByHeadings.put(headingRow.get(i).getText(), row.get(i));
            }

            rowsWithColumsByHeadings.add(rowByHeadings);
        }

        return rowsWithColumsByHeadings;


        }



    public String getValueFromCell(int rowNumber, String columName){

        List<Map<String, WebElement>> rowsWithColumsByHeading = getRowsWithColumsByHeadings();
        return rowsWithColumsByHeading.get(rowNumber - 1).get(columName).getText();
    }
    }

