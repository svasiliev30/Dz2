package sbp.io;

import java.io.*;
import java.util.Objects;

public class MyIOExample{

    /**
     * Создать объект класса {@link java.io.File}, проверить существование и чем является (фалй или директория).
     * Если сущность существует, то вывести в консоль информацию:
     *      - абсолютный путь
     *      - родительский путь
     * Если сущность является файлом, то вывести в консоль:
     *      - размер
     *      - время последнего изменения
     * Необходимо использовать класс {@link java.io.File}
     * @param fileName - имя файла
     * @return - true, если файл успешно создан
     */
        public boolean workWithFile (String fileName)
        {
            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("Fail is not.");
                return false;
            }
            if (!file.isFile()) {
                System.out.println("This is Directory");
                System.out.println(" Get absolute path - " + file.getAbsolutePath());
                System.out.println(" Get absolute path - " + file.getParent());
            }else {
                System.out.println("This is file");
                System.out.println(" Get absolute path - " + file.getAbsolutePath());
                System.out.println(" Get parent - " + file.getParent());
                System.out.println("Lenght at byte -" + file.length());
                System.out.println("Time with last modified -" + file.lastModified());
                                }

        return true;
        }


    /**
     * Метод должен создавать копию файла
     * Необходимо использовать IO классы {@link java.io.FileInputStream} и {@link java.io.FileOutputStream}
     * @param sourceFileName - имя исходного файла
     * @param destinationFileName - имя копии файла
     * @return - true, если файл успешно скопирован
     */
    public boolean copyFile(String sourceFileName, String destinationFileName) throws IOException {
        FileInputStream from = null;
        FileOutputStream in = null;

        try {
             from = new FileInputStream(sourceFileName);
             in = new FileOutputStream(destinationFileName);

            int symbol ;
            while ((symbol = from.read()) != -1){
                in.write(symbol);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(in)){
                in.close();
            }

            if (Objects.nonNull(from)){
                from.close();
            }
        }
        return true;
    }

    /**
     * Метод должен создавать копию файла
     * Необходимо использовать IO классы {@link java.io.BufferedInputStream} и {@link java.io.BufferedOutputStream}
     * @param sourceFileName - имя исходного файла
     * @param destinationFileName - имя копии файла
     * @return - true, если файл успешно скопирован
     */
    public boolean copyBufferedFile(String sourceFileName, String destinationFileName) throws IOException {
        FileInputStream from = null;
        BufferedInputStream from2 = null;

        FileOutputStream in = null;
        BufferedOutputStream in2 = null;

        try {
            from = new FileInputStream(sourceFileName);
            from2 = new BufferedInputStream(from);

            in = new FileOutputStream(destinationFileName);
            in2 = new BufferedOutputStream(in);

            int symbol;
            while ((symbol = from2.read()) != -1) {
                in2.write(symbol);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(from2)) {
                from2.close();
            }

            if (Objects.nonNull(in2)) {
                in2.close();
            }
            return true;
        }
    }

        /**
         * Метод должен создавать копию файла
         * Необходимо использовать IO классы {@link java.io.FileReader} и {@link java.io.FileWriter}
         * @param sourceFileName - имя исходного файла
         * @param destinationFileName - имя копии файла
         * @return - true, если файл успешно скопирован
         */
        public boolean copyFileWithReaderAndWriter (String sourceFileName, String destinationFileName) throws IOException {

            FileReader from3 = null;
            FileWriter in3 = null;

            try {
                from3 = new FileReader(sourceFileName);
                in3 = new FileWriter(destinationFileName);

                int symbol;
                while ((symbol = from3.read()) != -1) {
                    in3.write(symbol);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (Objects.nonNull(from3)) {
                    from3.close();
                }

                if (Objects.nonNull(in3)) {
                    in3.close();
                }
                return true;
            }
        }
    }
