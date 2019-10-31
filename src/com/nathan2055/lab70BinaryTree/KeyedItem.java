/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivertree;

/**
 *
 * @author fansari
 */
//Question mark, ?, is used to represent an unknown class type: Referred to as a wildcard
//KT is any class which extends compareable 
//matches a compareable of type KT or any of its superclasses
//Number is super class of Double and Integer

public abstract class KeyedItem<KT extends Comparable<?super KT>> {
   private KT searchKey;

   public KeyedItem(KT key) {
      searchKey = key;
   }  // end constructor

   public KT getKey() {
      return searchKey;
   } // end getKey
} // end KeyedItem
