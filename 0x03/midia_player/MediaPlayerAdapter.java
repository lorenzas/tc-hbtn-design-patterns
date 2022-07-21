public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (!tipoMedia.equals(TipoMedia.MP3)) {
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        switch (tipoMedia) {
            case VLC:
                advancedMediaPlayer.reproduzirVlc(nomeArquivo);
                break;
            case MP4:
                advancedMediaPlayer.reproduzirMp4(nomeArquivo);
                break;
            default:
                throw new IllegalArgumentException("Tipo de mídia não existe");
        }
    }
}
