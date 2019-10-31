package com.nathan2055.lab70BinaryTree;

//Question mark, ?, is used to represent an unknown class type: Referred to as a wildcard
//KT is any class which extends compareable 
//matches a compareable of type KT or any of its superclasses
//Number is super class of Double and Integer

public abstract class KeyedItem<KT extends Comparable<? super KT>> {
    private KT searchKey;

    public KeyedItem(KT key) {
        searchKey = key;
    }  // end constructor

    public KT getKey() {
        return searchKey;
    } // end getKey
} // end KeyedItem
