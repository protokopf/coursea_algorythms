package com.protokopf.Interfaces;

public interface IUnionFind<T> {

    void union(T a, T b);

    boolean areConnected(T a, T b);
}
