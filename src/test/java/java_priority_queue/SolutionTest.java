package java_priority_queue;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testEmptyEventsReturnsEmptyList() {
		List<Student> students = Solution.getStudents(Collections.emptyList());

		Assertions.assertTrue(students.isEmpty());
	}

	@Test
	void testSingleEnterNoServed() {
		List<Student> students = Solution.getStudents(List.of("ENTER Alice 3.5 1"));

		Assertions.assertEquals(1, students.size());
		Assertions.assertEquals("Alice", students.get(0).getName());
	}

	@Test
	void testServedRemovesHighestCPGA() {
		List<Student> students = Solution.getStudents(List.of(
				"ENTER Alice 3.5 1",
				"ENTER Bob 3.8 2",
				"SERVED"));

		Assertions.assertEquals(1, students.size());
		Assertions.assertEquals("Alice", students.get(0).getName());
	}

	@Test
	void testTieBrokenByNameAlphabetically() {
		List<Student> students = Solution.getStudents(List.of(
				"ENTER Bob 3.5 1",
				"ENTER Alice 3.5 2"));

		Assertions.assertEquals(2, students.size());
		Assertions.assertEquals("Alice", students.get(0).getName());
		Assertions.assertEquals("Bob", students.get(1).getName());
	}

	@Test
	void testTieBrokenByIdWhenCpgaAndNameEqual() {
		List<Student> students = Solution.getStudents(List.of(
				"ENTER Alice 3.5 5",
				"ENTER Alice 3.5 3"));

		Assertions.assertEquals(2, students.size());
		Assertions.assertEquals(3, students.get(0).getID());
		Assertions.assertEquals(5, students.get(1).getID());
	}

	@Test
	void testServedOnEmptyQueueIsIgnored() {
		List<Student> students = Solution.getStudents(List.of(
				"SERVED",
				"SERVED",
				"ENTER Alice 3.5 1",
				"SERVED",
				"SERVED"));

		Assertions.assertTrue(students.isEmpty());
	}

	@Test
	void testSampleSequenceFromProblemStatement() {
		List<Student> students = Solution.getStudents(List.of(
				"ENTER Bidhan 3.75 50",
				"ENTER Rijul 3.80 24",
				"ENTER Shafaet 3.70 35",
				"SERVED",
				"SERVED",
				"ENTER Samiha 3.85 36",
				"SERVED",
				"ENTER Ratul 3.90 42",
				"ENTER Tanvir 3.60 46",
				"ENTER Anik 3.95 49"));

		Assertions.assertEquals(4, students.size());
		Assertions.assertEquals("Anik", students.get(0).getName());
		Assertions.assertEquals("Ratul", students.get(1).getName());
		Assertions.assertEquals("Shafaet", students.get(2).getName());
		Assertions.assertEquals("Tanvir", students.get(3).getName());
	}

	@Test
	void testEventNamesAreCaseInsensitive() {
		List<Student> students = Solution.getStudents(List.of(
				"enter Alice 3.5 1",
				"enter Bob 3.8 2",
				"served"));

		Assertions.assertEquals(1, students.size());
		Assertions.assertEquals("Alice", students.get(0).getName());
	}

	@Test
	void testHRTestCase2() {
		List<Student> students = Solution.getStudents(List.of(
						"SERVED",
						"SERVED",
						"ENTER hlWxKPqBfC 3.53 44658",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER xsDLqIZrWmiH 2.29 9330",
						"SERVED",
						"ENTER UBRidLatqJakcJTfuSquBq 2.04 6623",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER nXWJwco 3.21 22418",
						"ENTER BwDHKIEjharkH 1.77 1368",
						"SERVED",
						"SERVED",
						"ENTER PSzREquHPlLddcJQMqvwHGzX 3.72 43183",
						"ENTER HtTexroqy 3.55 26154",
						"ENTER zLKpidI 0.56 8480",
						"ENTER UNzYblVVXWXvwuWfTuFYAIrX 0.40 8948",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER YOnLvpPJVNVn 1.54 48712",
						"SERVED",
						"SERVED",
						"ENTER YpamFyZoT 2.40 8699",
						"SERVED",
						"SERVED",
						"ENTER tFptdulWwAQhIvv 1.86 9743",
						"SERVED",
						"ENTER GpELxJnr 1.24 30350",
						"ENTER xMoGOJvcdlwYdQpTyBrvsfg 1.04 16988",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER OFKnJcWbifnPZVREiHmHKNS 3.97 2740",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER MdFElCSDE 2.51 16623",
						"ENTER okbpgNxEEaiLJtGhSdTqX 2.76 42696",
						"ENTER TtDHCS 2.12 9818",
						"SERVED",
						"SERVED",
						"ENTER iyuoiPoMgtwPUqQnq 1.95 73916",
						"ENTER IAXFtTXmiVCWsuErtZl 1.12 83226",
						"ENTER IKOwlrEdFpjpYVFTTkkL 2.16 22753",
						"SERVED",
						"ENTER zOQEjsZMoVdzNKyxPsFMu 1.57 53822",
						"ENTER xyfxTZirwKw 2.29 61073",
						"ENTER cWXBNmOVMbzcM 1.14 21498",
						"ENTER HWMjEtQGlrPcplKhC 1.07 52771",
						"ENTER XtWnANyOAWeEudUbZTJOHuNz 3.47 58519",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER iOSvYIhkrqKXIEDmRITKavxO 1.87 39394",
						"ENTER CTpuzYlASpaPm 2.57 74112",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER vUNGzSBU 0.12 372",
						"SERVED",
						"SERVED",
						"ENTER JnHCuGoyIjONxyPWLbOtexG 1.32 10512",
						"ENTER FhgszomYLh 0.10 96213",
						"SERVED",
						"ENTER UytyJgxjcawMDtzd 2.29 43679",
						"ENTER EjKxHD 1.30 57802",
						"ENTER xwVHfQnkLufCfmm 0.01 93401",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER akOcRRLVWrLlhxEajYDGbq 0.32 8346",
						"SERVED",
						"SERVED",
						"ENTER vpkeNbzJCsHKpRP 0.06 79819",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"SERVED",
						"ENTER BzEKGukpemC 2.89 41724",
						"SERVED",
						"ENTER HSMjJivfbjjmKJRQL 3.27 65620"
				)
		);
		Assertions.assertEquals(1, students.size());
		Assertions.assertEquals("HSMjJivfbjjmKJRQL", students.get(0).getName());
	}
}