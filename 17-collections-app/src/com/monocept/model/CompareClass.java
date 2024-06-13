package com.monocept.model;

import java.util.Comparator;

public class CompareClass {
	public static class SortByNumber implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy o1, InsurancePolicy o2) {
			
			return (int) (o1.getPolicyNumber()-o2.getPolicyNumber());
		}}
	
	public static class SortByName implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy o1, InsurancePolicy o2) {
			// TODO Auto-generated method stub
			return o1.getPolicyHolderName().compareTo(o2.getPolicyHolderName());
		}}
	public static class SortByAmount implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy o1, InsurancePolicy o2) {
			// TODO Auto-generated method stub
			return (int) (o1.getPolicyAmount()-o2.getPolicyAmount());
		}}
	public static class SortByDate implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy o1, InsurancePolicy o2) {
			// TODO Auto-generated method stub
			return o1.getPolicyCreationDate().compareTo(o2.getPolicyCreationDate());
		}}
}
