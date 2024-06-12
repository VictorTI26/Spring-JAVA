package br.senai.sc.demo.service;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Converte para formatos compativeis e executar as regras de negocios
@Service
//Faz o construtor de forma automatica com todos os parâmetros
@AllArgsConstructor
//@RequiredArgsConstructor
public class UsuarioService {
//    @NonNull
    private UsuarioRepository usuarioRepository;
    public Usuario cadastroUsuario(Usuario usuario) {
//        usuario.validarIdade();
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuario(Integer id) {
        Optional<Usuario> optional = usuarioRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }else {
            throw new RuntimeException();
        }
    }
}
