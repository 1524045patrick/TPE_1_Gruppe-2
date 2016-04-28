package mitgliederVerwaltung;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

@SuppressWarnings("serial")
public class MembershipList<K, V> extends HashMap<K, V> implements Map<K, V>{

	/**
	 * Standard Konstruktor
	 */
	public MembershipList(){
		super();
	}

	@Override
	public void clear() {
		super.clear();
	}

	@Override
	public Object clone() {
		return super.clone();
	}

	@Override
	public V compute(K arg0, BiFunction<? super K, ? super V, ? extends V> arg1) {
		return super.compute(arg0, arg1);
	}

	@Override
	public V computeIfAbsent(K arg0, Function<? super K, ? extends V> arg1) {
		return super.computeIfAbsent(arg0, arg1);
	}

	@Override
	public V computeIfPresent(K arg0, BiFunction<? super K, ? super V, ? extends V> arg1) {
		return super.computeIfPresent(arg0, arg1);
	}

	@Override
	public boolean containsKey(Object arg0) {
		return super.containsKey(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		return super.containsValue(arg0);
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return super.entrySet();
	}

	@Override
	public void forEach(BiConsumer<? super K, ? super V> arg0) {
		super.forEach(arg0);
	}

	@Override
	public V get(Object arg0) {
		return super.get(arg0);
	}

	@Override
	public V getOrDefault(Object arg0, V arg1) {
		return super.getOrDefault(arg0, arg1);
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		return super.keySet();
	}

	@Override
	public V merge(K arg0, V arg1, BiFunction<? super V, ? super V, ? extends V> arg2) {
		return super.merge(arg0, arg1, arg2);
	}

	@Override
	public V put(K arg0, V arg1) {
		return super.put(arg0, arg1);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> arg0) {
		super.putAll(arg0);
	}

	@Override
	public V putIfAbsent(K arg0, V arg1) {
		return super.putIfAbsent(arg0, arg1);
	}

	@Override
	public boolean remove(Object arg0, Object arg1) {
		return super.remove(arg0, arg1);
	}

	@Override
	public V remove(Object arg0) {
		return super.remove(arg0);
	}

	@Override
	public boolean replace(K arg0, V arg1, V arg2) {
		return super.replace(arg0, arg1, arg2);
	}

	@Override
	public V replace(K arg0, V arg1) {
		return super.replace(arg0, arg1);
	}

	@Override
	public void replaceAll(BiFunction<? super K, ? super V, ? extends V> arg0) {
		super.replaceAll(arg0);
	}

	@Override
	public int size() {
		return super.size();
	}

	@Override
	public Collection<V> values() {
		return super.values();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}