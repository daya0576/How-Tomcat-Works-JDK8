package utils;

import java.util.*;

public final class Enumerator implements Enumeration {


    // ----------------------------------------------------------- Constructors


    /**
     * The <code>Iterator</code> over which the <code>Enumeration</code>
     * represented by this class actually operates.
     */
    private Iterator iterator = null;


    /**
     * Return an Enumeration over the values of the specified Collection.
     *
     * @param collection Collection whose values should be enumerated
     */
    public Enumerator(Collection collection) {

        this(collection.iterator());

    }


    /**
     * Return an Enumeration over the values returned by the
     * specified Iterator.
     *
     * @param iterator Iterator to be wrapped
     */
    public Enumerator(Iterator iterator) {

        super();
        this.iterator = iterator;

    }


    // ----------------------------------------------------- Instance Variables


    /**
     * Return an Enumeration over the values of the specified Map.
     *
     * @param map Map whose values should be enumerated
     */
    public Enumerator(Map map) {

        this(map.values().iterator());

    }


    // --------------------------------------------------------- Public Methods

    /**
     * Tests if this enumeration contains more elements.
     *
     * @return <code>true</code> if and only if this enumeration object
     * contains at least one more element to provide, <code>false</code>
     * otherwise
     */
    public boolean hasMoreElements() {

        return (iterator.hasNext());

    }


    /**
     * Returns the next element of this enumeration if this enumeration
     * has at least one more element to provide.
     *
     * @return the next element of this enumeration
     * @throws NoSuchElementException if no more elements exist
     */
    public Object nextElement() throws NoSuchElementException {

        return (iterator.next());

    }


}
