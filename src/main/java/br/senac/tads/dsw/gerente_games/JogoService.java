package br.senac.tads.dsw.gerente_games;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

@Service
public class JogoService {
	private AtomicInteger contador = new AtomicInteger(0);
	private Map<String, Jogo> mapJogos = new ConcurrentHashMap<>();

	@PostConstruct
	public void init() {
		mapJogos.put("Grand-Theft-Auto-V", new Jogo(contador.incrementAndGet(),
			"Grand Theft Auto V", 2013,
			"Playstation 3", true, ""));

		mapJogos.put("Watch-Dogs", new Jogo(contador.incrementAndGet(),
			"Watch Dogs", 2014,
			"Playstation 3", false, ""));

		mapJogos.put("Shadow-Of-The-Colossus", new Jogo(contador.incrementAndGet(),
			"Shadow Of The Colossus", 2005,
			"Playstation 2", true, ""));
	}

	public List<Jogo> obterJogos() {
		return new ArrayList<>(mapJogos.values());
	}

	public Optional<Jogo> obterJogo(String titulo) {
		return Optional.ofNullable(mapJogos.get(titulo));
	}
}
