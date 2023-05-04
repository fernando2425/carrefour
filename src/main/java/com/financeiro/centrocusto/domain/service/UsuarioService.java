package com.financeiro.centrocusto.domain.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

//import com.financeiro.centrocusto.domain.exception.ResourceBadRequestException;
import com.financeiro.centrocusto.domain.exception.ResourceNotFoundException;
import com.financeiro.centrocusto.domain.model.Usuario;
import com.financeiro.centrocusto.domain.repository.UsuarioRepository;
import com.financeiro.centrocusto.dto.usuario.UsuarioRequestDto;
import com.financeiro.centrocusto.dto.usuario.UsuarioResponseDto;

//import java.util.Date;

import java.util.Optional;
import java.util.stream.Collectors;


//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class UsuarioService implements ICRUDService<UsuarioRequestDto,UsuarioResponseDto>   {

   // @Autowired
  //  private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper mapper;


    @Override
    public List<UsuarioResponseDto> obterTodos() {

        List<Usuario> usuarios = usuarioRepository.findAll();       

        return usuarios.stream()
                .map(usuario -> mapper.map(usuario, UsuarioResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioResponseDto obterPorId(Long id) {
        Optional<Usuario> optUsuario = usuarioRepository.findById(id);

        if (optUsuario.isEmpty()) {
            throw new ResourceNotFoundException("Não foi possível encontrar o usuário com o id: " + id);
        }

        return mapper.map(optUsuario.get(), UsuarioResponseDto.class);
    }

   // private void validarUsuario(UsuarioRequestDto dto) {

    //    if (dto.getEmail() == null || dto.getSenha() == null) {
    //        throw new ResourceBadRequestException("E-mail e senha são obrigatórios");
    //    }
   // }

    @Override
    public UsuarioResponseDto cadastrar(UsuarioRequestDto dto) {

    if(dto.getEmail() == null || dto.getSenha() == null){
        throw new ResourceNotFoundException("E-mail e  senha são ogrigatórios");
    }

       Usuario usuario = mapper.map(dto,Usuario.class);

       usuario.setId(null);
        usuario = usuarioRepository.save(usuario);

        return mapper.map(usuario,UsuarioResponseDto.class);
       // validarUsuario(dto);

      //  Optional<Usuario> optUsuario = usuarioRepository.findByEmail(dto.getEmail());

     //   if(optUsuario.isPresent()){
     //       throw new ResourceBadRequestException("Já existe um usuário cadastro com o e-mail: " + dto.getEmail());
     //   }

     //   Usuario usuario = mapper.map(dto, Usuario.class);

     //   String senha = passwordEncoder.encode(usuario.getSenha());
     //   usuario.setSenha(senha);

      //  usuario.setId(null);
     //   usuario.setDataCadastro(new Date());
     //   usuario = usuarioRepository.save(usuario);
     //   return mapper.map(usuario, UsuarioResponseDto.class);
    }

    public UsuarioResponseDto obterPorEmail(String email) {
        Optional<Usuario> optUsuario = usuarioRepository.findByEmail(email);

        if (optUsuario.isEmpty()) {
            throw new ResourceNotFoundException("Não foi possível encontrar o usuário com o e-mail: " + email);
        }

        return mapper.map(optUsuario.get(), UsuarioResponseDto.class);
    }

    @Override
    public UsuarioResponseDto atualizar(Long id, UsuarioRequestDto dto) {

    if(dto.getEmail() == null || dto.getSenha() == null){
        throw new ResourceNotFoundException("E-mail e  senha são ogrigatórios");
    }

    obterPorId(id);
    Usuario usuario = mapper.map(dto,Usuario.class);
    usuario.setId(id);
    usuario = usuarioRepository.save(usuario);

    return mapper.map(usuario,UsuarioResponseDto.class);


      //   UsuarioResponseDto usuarioBanco = obterPorId(id);
      //  validarUsuario(dto);

     //   Usuario usuario = mapper.map(dto, Usuario.class);

    //    String senha = passwordEncoder.encode(dto.getSenha());
  //      usuario.setSenha(senha);

   //     usuario.setId(id);
   //     usuario.setDataInativacao(usuarioBanco.getDataInativacao());
   //     usuario.setDataCadastro(usuarioBanco.getDataCadastro());

    //    usuario = usuarioRepository.save(usuario);

    ///    return mapper.map(usuario, UsuarioResponseDto.class);
    }

    @Override
    public void deletar(Long id) {

        obterPorId(id);
       
         usuarioRepository.deleteById(id);

         //Optional<Usuario> optUsuario = usuarioRepository.findById(id);

       // if (optUsuario.isEmpty()) {
       //     throw new ResourceNotFoundException("Não foi possível encontrar o usuário com o id: " + id);
      //  }

      //  Usuario usuario = optUsuario.get();

      //  usuario.setDataInativacao(new Date());
        
      //  usuarioRepository.save(usuario);
    }    
}