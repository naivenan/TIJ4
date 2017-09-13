//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.
package exercise.ch14;

import java.util.*;

class Part {
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter" warning.
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	static List<Class<? extends Part>> partList = new ArrayList<Class<? extends Part>>();
	static {
		partList.add(FuelFilter.class);
		partList.add(AirFilter.class);
		partList.add(CabinAirFilter.class);
		partList.add(OilFilter.class);
		partList.add(FanBelt.class);
		partList.add(PowerSteeringBelt.class);
		partList.add(GeneratorBelt.class);
	}
	private static Random rand = new Random(47);

	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}

	public static Part createRandom2() {
		int n = rand.nextInt(partList.size());
		Part p = null;
		try {
			p = partList.get(n).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return p;
	}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
	// Create a Class Factory for each specific type:
	public static class Factory implements exercise.ch14.Factory<FuelFilter> {
		public FuelFilter create() {
			return new FuelFilter();
		}
	}
}

class AirFilter extends Filter {
	public static class Factory implements exercise.ch14.Factory<AirFilter> {
		public AirFilter create() {
			return new AirFilter();
		}
	}
}

class CabinAirFilter extends Filter {
	public static class Factory implements exercise.ch14.Factory<CabinAirFilter> {
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter {
	public static class Factory implements exercise.ch14.Factory<OilFilter> {
		public OilFilter create() {
			return new OilFilter();
		}
	}
}

class Belt extends Part {
}

class FanBelt extends Belt {
	public static class Factory implements exercise.ch14.Factory<FanBelt> {
		public FanBelt create() {
			return new FanBelt();
		}
	}
}

class GeneratorBelt extends Belt {
	public static class Factory implements exercise.ch14.Factory<GeneratorBelt> {
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}

class PowerSteeringBelt extends Belt {
	public static class Factory implements exercise.ch14.Factory<PowerSteeringBelt> {
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}
}

public class RegisteredFactories {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++)
//			System.out.println(Part.createRandom());
		for (int i = 0; i < 10; i++)
			System.out.println(Part.createRandom2());
		
	}
} /*
	 * Output: GeneratorBelt CabinAirFilter GeneratorBelt AirFilter
	 * PowerSteeringBelt CabinAirFilter FuelFilter PowerSteeringBelt
	 * PowerSteeringBelt FuelFilter
	 */// :~
