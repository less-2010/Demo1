package day18.se03.n1Collection.MyArrayList;

import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;


@XmlType
/**
 * ArrayList 源码分析
 *
 * @author BING
 * @date 2020/8/25 15:26
 * @since 1.8
 */
public class MyArrayList <E> extends AbstractList<E> implements List<E>,Serializable {
    //版本号
    private static final long serialVersionUID = 4894494655221316164L;
    //默认初始容量
    private static final int DEFAULT_CAPACITY = 10;
    //空对象数组
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    //默认空对象数组
    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};
    //元素数组
    // transient 修饰短暂的，不可序列化
    transient Object[] elementData;
    //实际元素数组容量，默认为0
    private int size;
    // 最大数组容量
    // 2147483647-8;
    private static final int MAX_ARRAY_SIZE= Integer.MAX_VALUE -8;

    //无参构造
    public MyArrayList(){
        // 设置元素数组为空
        this.elementData = DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
    }

    //构造一个具有指定初始容量的空列表
    public MyArrayList(int initialCapacity) {
        if (initialCapacity>0) { //初始容量大于0
            this.elementData = new Object[initialCapacity];//初始化元素数组
        }else if (initialCapacity==0){
            this.elementData =EMPTY_ELEMENT_DATA;//为空对象数组
        }else{//初始容量小于0，抛出异常
            throw new IllegalArgumentException("Illegal Capacity(非法初始容量)："+initialCapacity);
        }
    }
    //当传递的参数为集合类型时，会把集合类型转换为数组类型，并赋值给elemntDatha
//    public MyArrayList(Collection<? extends E> c){
//        elementData = c.toArray();
//        if ((size = elementData.length)!=0){
//
//        }
//    }


    /**
     * 范围检查，判断索引是否在数组范围内
     * 如果不在范围内抛出异常 IndexOutOfBoundsException
     * @param index
     */
    public void rangeCheck(int index) {
        //如果不在范围内抛出异常
        if (index<0||index>size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    /**
     *  返回索引和容量组成的字符串
     *
     * @param index
     * @return
     */
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size();
    }

    @Override
    public int size() {
        return elementData.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {

    }

    @Override
    public void sort(Comparator<? super E> c) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public boolean add(E e) {
        elementData[size]=e;
        return true;
    }

    @Override
    public void add(int index, E element) {
        rangeCheck(index);//检查范围
        elementData[index]=element;
        size++;
    }

    public E remove(int index) {
        rangeCheck(index);
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }

}
