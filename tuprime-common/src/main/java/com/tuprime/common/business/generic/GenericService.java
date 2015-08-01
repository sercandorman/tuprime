package com.tuprime.common.business.generic;


public interface GenericService<T> {
	void persist(T o);
	T find(Integer id);
	void update(T o);
	void delete(T o);
	void merge(T o);
}
