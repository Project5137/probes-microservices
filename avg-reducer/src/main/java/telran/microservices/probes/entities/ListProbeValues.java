package telran.microservices.probes.entities;

import java.util.*;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;

@RedisHash
@Getter
public class ListProbeValues {

	long id;
	List<Integer> values = new ArrayList<>();
	
	public ListProbeValues(long id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ListProbeValues))
			return false;
		ListProbeValues other = (ListProbeValues) obj;
		return id == other.id;
	}

	

	
	
	
}
