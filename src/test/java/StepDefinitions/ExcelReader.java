package StepDefinitions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    /**
     * Reads data from the specified Excel sheet and returns it as a list of maps.
     * Each map represents a row in the Excel sheet, with column headers as keys and cell values as values.
     *
     * @param excelFilePath the file path to the Excel file
     * @param sheetName the name of the sheet from which to read data
     * @return a list of maps, where each map contains key-value pairs representing column headers and their corresponding cell values for a row
     * @throws IOException if an I/O error occurs while reading the file
     */
    public List<Map<String, String>> getData(String excelFilePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Row headerRow = sheet.getRow(0);
        List<Map<String, String>> data = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row currentRow = sheet.getRow(i);
            Map<String, String> rowData = new HashMap<>();

            for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
                Cell headerCell = headerRow.getCell(j);
                Cell currentCell = currentRow.getCell(j);
                rowData.put(headerCell.getStringCellValue(),
                        currentCell.getStringCellValue());
            }
            data.add(rowData);
        }

        workbook.close();
        fis.close();
        return data;
    }
}
