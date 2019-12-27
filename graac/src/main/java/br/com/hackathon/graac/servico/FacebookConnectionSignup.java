package br.com.hackathon.graac.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.stereotype.Service;

import br.com.hackathon.graac.entidade.Usuario;
import br.com.hackathon.graac.repositorio.UsuarioRepository;

@Service
public class FacebookConnectionSignup implements ConnectionSignUp {
 
    @Autowired
    private UsuarioRepository userRepository;
 
    @Override
    public String execute(Connection<?> connection) {
        Usuario user = new Usuario();
        user.setUsername(connection.getDisplayName());
//        user.setPassword(randomAlphabetic(8));
        userRepository.save(user);
        return user.getUsername();
    }
}
