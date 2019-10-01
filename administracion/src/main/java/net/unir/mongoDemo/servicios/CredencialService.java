package net.unir.mongoDemo.servicios;

import net.unir.mongoDemo.modelo.Credencial;
import net.unir.mongoDemo.modelo.dto.CredencialDto;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CredencialService {

	public Credencial createCredencial(Credencial obj);

    public void createCredencial(List<Credencial> objs);

    public CredencialDto autenticar(String _id, String password);

	public Collection<Credencial> getAllCredencial();

	public Optional<Credencial> findCredencialById(String id);

	public void deleteCredencialById(String id);

	public void updateCredencial(Credencial obj);

}