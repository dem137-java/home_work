package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    DataContainer(T[] item){
        this.data=item;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    /**
     * метод добавляет элемент в свободную ячейку массива объектов обобщенного типа, в случае отсутствия свободных
     * ячеек, метод расширяет массив на 1 ячейку и помещает элемент в данную ячейку.
     * @param item переданный элемент для добавления
     * @return индекс добавленного элемента
     */
    public int add(T item) {
        int index = -1;

        if (item == null) {
            return index;
        }
        //проверяем есть ли свободное место в массиве и расширяем его, если нет
        if(!hasEmptySpace(data)){
            data = extendArray(data);
        }
        //итерируем массив, добавляем элемент
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                    index = i;
                    break;
            }
        }
        return index;
    }

    /**
     * метод возвращает объект, хранящийся в массиве под переданным индексом
     * @param index индекс возвращаемого элемента
     * @return элемент массива с переданным индексом
     */
    T get(int index){
        if (index<0||index>= data.length){
            return null;
        }else{
        return data[index];}
    }

    /**
     * метод возвращает поле data
     * @return поле data
     */
    T[] getItems(){
        return data;
    }

    /**
     * метод удаляет ячейку массива с заданным индексом
     * @param index индекс удаляемой ячейки
     * @return true - если ячейка удалена, false - если ячейка не удалена
     */
    public boolean delete(int index) {
        if (index < 0 || index >= data.length) {
            return false;
        } else {
            data[index] = null;
            data=cutArray(data);
            return true;
        }
    }

    public boolean delete(T item) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                data[i] = null;
                data = cutArray(data);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * метод сортирует массив data по возврастанию
     * @param comparator реализация интефейса Comparator
     */
    public void sort(Comparator<T> comparator) {
        for (int i=0;i < data.length-1;i++) {
            for (int j = data.length-1;j>i;j--) {
                if (comparator.compare(data[j], data[j - 1]) < 0) {
                    T tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    }

    /**
     * метод проверяет переданный массив обобщенных данных и возвращает true если в массиве есть свободное место
     * и false если нет
     * @param arr массив обобщенных данных
     * @return true если свободное место есть и false если нет
     */
    private boolean hasEmptySpace(T[] arr){
        int countEmpty = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                countEmpty++;
            }
        }
        if (countEmpty==0){
            return false;
        } else {
            return true;
        }
    }

    /**
     * метод расширяет массив на 1 ячейку
     * @param arr массив обобщенных данных
     * @return массив, содержащий значения предыдущего + 1 пустую ячейку
     */
    private T[] extendArray(T[] arr){
        T[] extendedArray = Arrays.copyOf(arr,arr.length+1);
        for (int i = 0; i < arr.length; i++) {
            extendedArray[i]=arr[i];
        }
        return extendedArray;
    }

    /**
     * метод удаляет пустую ячейку из переданного массива
     * @param arr массив обобщенных элементов
     * @return массив без пустой ячейки
     */
    private T[] cutArray(T[] arr){
        for (int i = 1; i<arr.length; i++){
            if (arr[i-1]==null){
                T tmp = arr[i];
                arr[i]=null;
                arr[i-1]=tmp;
            }
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
        return arr;
    }

    @Override
    public String toString() {
        if (data == null)
            return "null";

        int iMax = data.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if (data[i]!=null) {b.append(String.valueOf(data[i]));}
            if (i == iMax)
                return b.append(']').toString();
            if (data[i+1]!=null){b.append(", ");}
        }
    }
}

